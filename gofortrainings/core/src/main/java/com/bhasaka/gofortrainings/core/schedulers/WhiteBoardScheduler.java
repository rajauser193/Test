package com.bhasaka.gofortrainings.core.schedulers;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service=Runnable.class)
public class WhiteBoardScheduler implements Runnable{
	
	@ObjectClassDefinition(name="white board scheduler")
	public static @interface config{
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
