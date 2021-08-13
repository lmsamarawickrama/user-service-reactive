package org.saliam.smartbids.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Document
@Getter @Setter
public class User
{
  @Id
  private String id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;

  private Set<Role> roles;
}