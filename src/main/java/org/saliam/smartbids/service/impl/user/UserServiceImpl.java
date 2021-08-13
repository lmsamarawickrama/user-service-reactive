package org.saliam.smartbids.service.impl.user;

import org.saliam.smartbids.dto.user.UserCreateDto;
import org.saliam.smartbids.dto.user.UserDto;
import org.saliam.smartbids.domain.User;
import org.saliam.smartbids.mapper.UserMapper;
import org.saliam.smartbids.repository.UserRepository;
import org.saliam.smartbids.service.api.user.UserService;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserServiceImpl implements UserService
{
  private final UserRepository userRepository;

  private final UserMapper userMapper;

  public UserServiceImpl(final UserRepository userRepository, final UserMapper userMapper)
  {
    this.userRepository = userRepository;
    this.userMapper = userMapper;
  }

  @Override
  @Transactional
  public Mono<UserDto> save(final UserCreateDto userDto)
  {
    User user = userMapper.userCreateDtoToUser(userDto);
    Mono<User> savedUser = userRepository.save(user);
    return savedUser.map(userMapper::userToUserDto);
  }

  public Mono<UserDto> getById(final String id)
  {
    Mono<User> userById = userRepository.findById(id);
    return userById.map(userMapper::userToUserDto);
  }

  public Flux<UserDto> getAll()
  {
    Flux<User> users = userRepository.findAll();
    return users.map(userMapper::userToUserDto);
  }
}
