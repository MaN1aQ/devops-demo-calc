package com.demotest.calc.services;

import org.springframework.stereotype.Service;

import com.demotest.calc.models.CalcRequest;
import com.demotest.calc.services.core.AddComponent;

@Service("calcService")
public class CalcServiceImpl implements CalcService {

	@Override
	public Integer add(CalcRequest request) {
		return AddComponent.add(request);
	}

}
