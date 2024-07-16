package dev.mvc.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j // lombok 의 log 기능을 사용
@RestController
public class CICDCont {
  public CICDCont() {
    System.out.println("-> CICDCont created.");
  }

  // push test
  // http://localhost:9091/cicd?sw=-1
  // http://localhost:9091/cicd?sw=0
  // http://localhost:9091/cicd?sw=1
  @GetMapping("/cicd")
  public String cicd(@RequestParam(defaultValue = "1") Integer sw) { // defaultValue = "1" -> 1
    String msg = "";
    
    // log 기능을 이용하여 글자 색깔에 차이를 두어 디버깅이 가능함
    if (sw == -1) {
      msg = "/cide 호출됨, error 로그";
      log.error(msg);
    } else if (sw == 0) {
      msg = "/cide 호출됨, warn 로그";
      log.warn(msg);
    }else if (sw == 1) {
      msg = "/cicd 호출됨, info 로그";
      log.info(msg);
    }
    return "<h3>" + msg + "</h3>";
  }
  
}

