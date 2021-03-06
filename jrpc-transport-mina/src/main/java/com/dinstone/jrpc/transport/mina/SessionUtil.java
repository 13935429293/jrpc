/*
 * Copyright (C) 2014~2016 dinstone<dinstone@163.com>
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
package com.dinstone.jrpc.transport.mina;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.mina.core.session.IoSession;

import com.dinstone.jrpc.transport.ResultFuture;

public class SessionUtil {

    public static void setResultFutureMap(IoSession session) {
        session.setAttribute(ConcurrentHashMap.class.getName(), new ConcurrentHashMap<Integer, ResultFuture>());
    }

    @SuppressWarnings("unchecked")
    public static Map<Integer, ResultFuture> getResultFutureMap(IoSession session) {
        return (Map<Integer, ResultFuture>) session.getAttribute(ConcurrentHashMap.class.getName());
    }
}
