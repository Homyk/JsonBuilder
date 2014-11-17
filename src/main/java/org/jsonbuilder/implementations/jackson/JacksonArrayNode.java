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

import org.jsonbuilder.interfaces.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BaseJsonNode;

/**
 * @author Håkon Lindquist
 */
public class JacksonArrayNode implements org.jsonbuilder.interfaces.ArrayNode {
  
  private static final ObjectMapper objectMapper = new ObjectMapper();
  private final ArrayNode arrayNode;
  
  public JacksonArrayNode() {
    this.arrayNode = objectMapper.createArrayNode();
  }

  @Override
  public void add(JsonNode node) {
    arrayNode.add((BaseJsonNode) node.getNative());
  }

  @Override
  public Object getNative() {
    return this.arrayNode;
  }
  
  @Override
  public String toString() {
    return this.arrayNode.toString();
  }
}