package test;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Current;
import javax.enterprise.inject.Named;
import javax.mail.Session;
import javax.persistence.EntityManager;

@Named("echoer")
@ApplicationScoped
public class EchoService implements Echo
{
	private static final Logger log = Logger.getLogger(EchoService.class.getName());
	
	/** */
	@Ours Session mail;
	@Current EntityManager em;
	
	/** */
	public EchoService()
	{
		log.info("Constructor");
	}

	/** */
	public String getThing()
	{
		log.info("getThing()");
		
		log.info("Mail session is " + mail + ", " + mail.getProperties());
		log.info("EM is " + this.em);

		return this.em.toString();
	}

	/** */
	public String echo(String s)
	{
		log.info("Echoing: " + s);
		
		log.info("Mail session is " + mail + ", " + mail.getProperties());

		return s;
	}
}
