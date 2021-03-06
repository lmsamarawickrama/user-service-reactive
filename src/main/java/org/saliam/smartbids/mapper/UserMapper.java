package org.saliam.smartbids.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.saliam.smartbids.dto.user.UserCreateDto;
import org.saliam.smartbids.dto.user.UserDto;
import org.saliam.smartbids.domain.User;

@Mapper(uses = RoleMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper
{
  User userCreateDtoToUser(UserCreateDto userCreateDto);

  UserDto userToUserDto(User user);
}
