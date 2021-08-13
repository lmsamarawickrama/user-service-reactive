package org.saliam.smartbids.mapper;

import org.mapstruct.Mapper;
import org.saliam.smartbids.dto.user.RoleDto;
import org.saliam.smartbids.domain.Role;

@Mapper
public interface RoleMapper
{
  Role roleDtoToRole(RoleDto roleDto);

  RoleDto roleToRoleDto(Role role);
}
