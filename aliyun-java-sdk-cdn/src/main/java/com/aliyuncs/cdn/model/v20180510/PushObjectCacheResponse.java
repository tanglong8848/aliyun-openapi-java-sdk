/*
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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.PushObjectCacheResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PushObjectCacheResponse extends AcsResponse {

	private String requestId;

	private String preloadTaskId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPreloadTaskId() {
		return this.preloadTaskId;
	}

	public void setPreloadTaskId(String preloadTaskId) {
		this.preloadTaskId = preloadTaskId;
	}

	@Override
	public PushObjectCacheResponse getInstance(UnmarshallerContext context) {
		return	PushObjectCacheResponseUnmarshaller.unmarshall(this, context);
	}
}