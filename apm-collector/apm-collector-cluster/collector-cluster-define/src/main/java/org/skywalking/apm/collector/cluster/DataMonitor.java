/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
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
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.cluster;

import org.skywalking.apm.collector.client.Client;
import org.skywalking.apm.collector.client.ClientException;

/**
 * 数据监视器接口
 *
 * @author peng-yongsheng
 */
public interface DataMonitor {

    /**
     * 基础目录
     */
    String BASE_CATALOG = "/skywalking";

    void setClient(Client client);

    void addListener(ClusterModuleListener listener) throws ClientException;

    void register(String path, ModuleRegistration registration) throws ClientException;

    ClusterModuleListener getListener(String path);

    void createPath(String path) throws ClientException;

    void setData(String path, String value) throws ClientException;
}
