/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package com.gewara.web.support;

import com.gewara.util.BaseWebUtils;
import com.gewara.util.LogTraceUtil.LogTrace;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class RequestTrace implements LogTrace {
	public String getTrace() {
		HttpServletRequest request = this.getRequest();
		if (request != null) {
			String trace = request.getRequestURI();
			if (!ServletFileUpload.isMultipartContent(request)) {
				trace = trace + ":" + BaseWebUtils.getParamStr(request, true, new String[0]);
			}

			return trace;
		} else {
			return null;
		}
	}

	private HttpServletRequest getRequest() {
		ServletRequestAttributes holder = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if (holder != null) {
			HttpServletRequest request = holder.getRequest();
			if (request != null) {
				return request;
			}
		}

		return null;
	}
}