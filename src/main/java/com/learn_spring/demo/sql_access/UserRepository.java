/*
 * Copyright (c) 2020 github.com/xpenalosa. Check COPYRIGHT file for usage permissions.
 */

package com.learn_spring.demo.sql_access;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}