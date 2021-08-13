package org.saliam.smartbids.controller;

import org.saliam.smartbids.dto.user.UserCreateDto;
import org.saliam.smartbids.dto.user.UserDto;
import org.saliam.smartbids.service.api.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController
{
  private UserService userService;

  @Autowired
  public void setUserService(UserService userService)
  {
    this.userService = userService;
  }

  @PostMapping(value = "/users")
  public Mono<UserDto> save(@RequestBody UserCreateDto userCreateDto)
  {
    return userService.save(userCreateDto);
  }

  @GetMapping(value = "/users/{id}")
  public Mono<UserDto> get(@PathVariable(name = "id") String id)
  {
    return userService.getById(id);
  }

  @GetMapping(value = "/users")
  public Flux<UserDto> getAll()
  {
    return userService.getAll();
  }
}
