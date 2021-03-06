/**
 * Copyright 2016 Thomas Feng
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.tfeng.playmods.oauth2;

import org.apache.http.HttpStatus;

import me.tfeng.playmods.spring.ApplicationError;

/**
 * @author Thomas Feng (huining.feng@gmail.com)
 */
public class AuthenticationError extends ApplicationError {

  public AuthenticationError() {
    super(HttpStatus.SC_UNAUTHORIZED);
  }

  public AuthenticationError(String message) {
    super(HttpStatus.SC_UNAUTHORIZED, message);
  }

  public AuthenticationError(String message, Throwable cause) {
    super(HttpStatus.SC_UNAUTHORIZED, message, cause);
  }

  public AuthenticationError(Throwable cause) {
    super(HttpStatus.SC_UNAUTHORIZED, cause);
  }
}
