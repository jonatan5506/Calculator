package com.saude.calc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saude.calc.models.Abcd2;
import com.saude.calc.models.AnionGapSerico;
import com.saude.calc.models.Apgar;
import com.saude.calc.models.AscDubois;
import com.saude.calc.services.CalcAbcd2;
import com.saude.calc.services.CalcAbcd3;
import com.saude.calc.services.CalcAlvarado;
import com.saude.calc.models.Abcd3;
import com.saude.calc.models.Alvarado;
import com.saude.calc.services.CalcAnionGapSerico;
import com.saude.calc.services.CalcApgar;
import com.saude.calc.services.CalcAscDubois;

@RestController
@CrossOrigin("*")// Retira qualquer bloqueio para receber dados externos
@RequestMapping("/calc")
public class Controller {
  
  //Calc calc = new Calc();

  @PostMapping("/aniongapserico")
  @Transactional
  public ResponseEntity<String> AnionGapSerico(@RequestBody AnionGapSerico request) {

    CalcAnionGapSerico calc = new CalcAnionGapSerico();

    String resultado = calc.calcAnionGapSerico(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/asc")
  @Transactional
  public ResponseEntity<String> AscDubois(@RequestBody AscDubois request) {

    CalcAscDubois calc = new CalcAscDubois();

    String resultado = calc.ascDubois(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/abcd2")
  @Transactional
  public ResponseEntity<String> Abcd2(@RequestBody Abcd2 request){

    CalcAbcd2 calc = new CalcAbcd2();

    String resultado = calc.Abcd2(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/abcd3")
  @Transactional
  public ResponseEntity<String> abcd3(@RequestBody Abcd3 request){

    CalcAbcd3 calc = new CalcAbcd3();
    String resultado = calc.Abcd3(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }

  @PostMapping("/alvarado")
  @Transactional
  public ResponseEntity<String> alvarado(@RequestBody Alvarado request){
    CalcAlvarado calc = new CalcAlvarado();
    String resultado = calc.Alvarado(request);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
  }
  //TODO...
  @PostMapping("/apgar")
  @Transactional
  public ResponseEntity<Integer> apgar(@RequestBody Apgar apgar) {
    CalcApgar calcApgar = new CalcApgar();
    Integer resultado = calcApgar.Apgar(apgar);
    return new ResponseEntity<>(resultado, HttpStatus.OK);
}
}

