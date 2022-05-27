package com.examplo.calculador;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SubtraiDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Long a = (Long) execution.getVariable("valorA");
        Long b = (Long) execution.getVariable("valorB");

        execution.setVariable("resultadoFinal", a - b);
    }
}
