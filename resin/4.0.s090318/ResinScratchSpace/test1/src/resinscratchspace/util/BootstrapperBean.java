package resinscratchspace.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.caucho.config.Service;

@Service
public class BootstrapperBean implements Bootstrapper {
//	@Current
//	private Logger log;	
	private static final Logger log = Logger.getLogger(BootstrapperBean.class.getName());

	@PostConstruct
	public void init(){
		System.out.println("Starting Bootstrapper Service!");
		log.log(Level.INFO,"Starting Bootstrapper Service!");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Stopping Bootstrapper Service!");
		log.log(Level.INFO,"Stopping Bootstrapper Service!");
	}
}
