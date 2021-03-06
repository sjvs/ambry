/**
 * Copyright 2017 LinkedIn Corp. All rights reserved.
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
 */

package com.github.ambry.server;

import java.util.List;


/**
 * A model object that contains metadata information about some reported stats. For example, the kind of stats that is
 * being reported, timestamp and etc.
 */
class StatsHeader {
  enum StatsDescription {
    QUOTA
  }

  private final StatsDescription description;
  private final long timestamp;
  private final int storesContactedCount;
  private final int storesRespondedCount;
  private final List<String> unreachableStores;

  StatsHeader(StatsDescription description, long timestamp, int storesContactedCount, int storesRespondedCount,
      List<String> unreachableStores) {
    this.description = description;
    this.timestamp = timestamp;
    this.storesContactedCount = storesContactedCount;
    this.storesRespondedCount = storesRespondedCount;
    this.unreachableStores = unreachableStores;
  }
}
