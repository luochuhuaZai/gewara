/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.ucenter.api.openlogin;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.OpenResultVo;

public interface MSQMAppAuthorizeVoService {
	ResultCode<OpenResultVo> getMSQMLoginMemberVoByContext(String arg0, String arg1);
}