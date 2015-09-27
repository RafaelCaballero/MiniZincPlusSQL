package logger;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.encoder.EchoEncoder;
import ch.qos.logback.core.encoder.Encoder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class AreaAppender extends AppenderBase<ILoggingEvent> {
	private Encoder<ILoggingEvent> encoder = new EchoEncoder<ILoggingEvent>();
	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public AreaAppender() {

		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		setContext(lc);
		start();
		lc.getLogger("ROOT").addAppender(this);
	}

	@Override
	public void start() {
		try {
			encoder.init(out);
		} catch (IOException e) {
		}
		super.start();
	}

	@Override
	public void append(ILoggingEvent event) {
		try {
			encoder.doEncode(event);
			out.flush();
			String line = out.toString();
			String display = sdf.format(cal.getTime()) + " " + line;

			TextFactory.add(display);

			out.reset();
		} catch (IOException e) {
		}
	}

	public static Logger getLogger(Class<?> class1) {
		/*
		 * LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		 * PatternLayoutEncoder ple = new PatternLayoutEncoder();
		 * 
		 * ple.setPattern(
		 * "%date %level [%thread] %logger{10} [%file:%line] %msg%n");
		 * ple.setContext(lc); ple.start();
		 */
		AreaAppender appender = new AreaAppender();

		appender.start();

		Logger logger = (Logger) LoggerFactory.getLogger(class1);
		logger.addAppender(appender);
		logger.setLevel(Level.TRACE);
		logger.setAdditive(false); /* set to true if root should log too */

		return logger;
	}

}
