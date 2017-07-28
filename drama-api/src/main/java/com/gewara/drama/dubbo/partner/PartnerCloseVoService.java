/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.drama.dubbo.partner;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaCloseRuleVo;
import java.util.List;

public interface PartnerCloseVoService {
	ResultCode<List<DramaCloseRuleVo>> getCloseList();
}