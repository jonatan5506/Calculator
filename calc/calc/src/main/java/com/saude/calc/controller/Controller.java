package com.saude.calc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saude.calc.models.Abcd2;
import com.saude.calc.models.AnionGapSerico;
import com.saude.calc.models.AscDubois;
//import com.saude.calc.services.Calc;
import com.saude.calc.services.CalcAbcd2;
import com.saude.calc.services.CalcAnionGapSerico;
import com.saude.calc.services.CalcAscDubois;

@RestController
@RequestMapping("/calc")
public class Controller {
  
  //Calc calc = new Calc();

  @PostMapping("/aniongapserico")
  public ResponseEntity<String> AnionGapSerico(@RequestBody AnionGapSerico request) {

    CalcAnionGapSerico calc = new CalcAnionGapSerico();

    String resultado = calc.calcAnionGapSerico(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/asc")
  public ResponseEntity<String> AscDubois(@RequestBody AscDubois request) {

    CalcAscDubois calc = new CalcAscDubois();

    String resultado = calc.ascDubois(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/abcd2")
  public ResponseEntity<String> Abcd2(@RequestBody Abcd2 request){

    CalcAbcd2 calc = new CalcAbcd2();

    String resultado = calc.Abcd2(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }
}
