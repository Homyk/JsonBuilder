/*
 * Copyright (C) Håkon Lindquist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonbuilder.implementation.minimaljson;

import org.jsonbuilder.JsonBuilderTest;
import org.jsonbuilder.implementations.gson.GsonAdapter;
import org.jsonbuilder.interfaces.JsonAdapter;

/**
 * @author Håkon Lindquist
 */
public class JsonBuilderMinimalTest extends JsonBuilderTest {

  @Override
  protected JsonAdapter getAdapter() {
    return new GsonAdapter();
  }
}