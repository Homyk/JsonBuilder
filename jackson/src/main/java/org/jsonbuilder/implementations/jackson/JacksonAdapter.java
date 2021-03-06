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

package org.jsonbuilder.implementations.jackson;

import org.jsonbuilder.interfaces.ArrayNode;
import org.jsonbuilder.interfaces.BooleanNode;
import org.jsonbuilder.interfaces.JsonAdapter;
import org.jsonbuilder.interfaces.NullNode;
import org.jsonbuilder.interfaces.NumberNode;
import org.jsonbuilder.interfaces.ObjectNode;
import org.jsonbuilder.interfaces.StringNode;

/**
 * @author Håkon Lindquist
 */
public class JacksonAdapter implements JsonAdapter {

  @Override
  public ObjectNode getObjectNode() {
    return new JacksonObjectNode();
  }

  @Override
  public ArrayNode getArrayNode() {
    return new JacksonArrayNode();
  }

  @Override
  public NullNode getNullNode() {
    return new JacksonNullNode();
  }

  @Override
  public NumberNode getNumberNode(Number number) {
    return new JacksonNumberNode(number);
  }

  @Override
  public StringNode getStringNode(String value) {
    return new JacksonStringNode(value);
  }

  @Override
  public BooleanNode getBooleanNode(Boolean value) {
    return new JacksonBooleanNode(value);
  }
}