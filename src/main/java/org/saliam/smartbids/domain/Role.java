package org.saliam.smartbids.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
public class Role
{
  @Id
  private String id;

  private Type type;

  private String name;

  public enum Type
  {
    ADMIN, BIDDER, AUCTIONEER
  }
}