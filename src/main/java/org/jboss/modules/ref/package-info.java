/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Classes which implement reference types which can be cleaned up automatically by a background thread.  See
 * {@link org.jboss.modules.ref.Reference Reference} and its subtypes, and {@link org.jboss.modules.ref.Reaper Reaper} for more information.
 *
 * @deprecated Use {@link java.lang.ref.Cleaner} or one of the reference types from a support library such as
 *      {@code io.smallrye.common:smallrye-common-ref} instead.
 */
package org.jboss.modules.ref;
