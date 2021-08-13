package org.saliam.smartbids.service.api.user;

import org.saliam.smartbids.dto.user.UserCreateDto;
import org.saliam.smartbids.dto.user.UserDto;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService
{
  @Transactional
  Mono<UserDto> save(UserCreateDto userDto);

  Mono<UserDto> getById(String id);

  Flux<UserDto> getAll();
}
