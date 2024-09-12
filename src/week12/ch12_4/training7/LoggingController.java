package week12.ch12_4.training7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Logger;


import org.slf4j.LoggerFactory;

@RestController
public class LoggingController {
    
    // 지시사항을 참고하여 코드를 작성해 보세요.
    @PostMapping("/setting/logging")
    public ResponseEntity<String> changeLogLevel(@RequestParam("package")String packageName, @RequestParam("level")String level) {
        
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger logger = loggerContext.getLogger(packageName);

        switch(level.toUpperCase()) {
            case "ERROR" :
                logger.setLevel(Level.ERROR);
                break;

            case "WARN" :
                logger.setLevel(Level.WARN);
                break;

            case "INFO" :
                logger.setLevel(Level.INFO);
                break;

            case "DEBUG" :
                logger.setLevel(Level.DEBUG);
                break;

            case "TRACE" :
                logger.setLevel(Level.TRACE);
                break;
            
            default :
                return ResponseEntity.badRequest().body("Invalid log level");
        }
        return ResponseEntity.ok().body(packageName + level);
    }
}