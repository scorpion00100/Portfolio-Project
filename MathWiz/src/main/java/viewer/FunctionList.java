package viewer;

import formula.*;
import formula.Power;
import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class FunctionList {
  private final List<PlottableFunction> functions = new ArrayList<>();

  private final FunctionChart functionChart;
  private final double lowerBound;
  private final double upperBound;

  FunctionList(FunctionChart functionChart) {
    this.functionChart = functionChart;
    this.lowerBound = functionChart.getLowerBound();
    this.upperBound = functionChart.getUpperBound();

    List<PlottableFunction> functions = List.of(new PlottableFunction(new Logarithm(new VariableX()),"f"),
            new PlottableFunction(new Multiplication(new VariableX(), new Constant(3)), "g"),
            new PlottableFunction(new Division(new Constant(1), new VariableX()), "h"),
            new PlottableFunction(new Power(new VariableX(), new Constant(2)), "j"),
            new PlottableFunction(new SquareRoot(new VariableX()), "k"),
            new PlottableFunction(new Sine(new VariableX()), "l"),
            new PlottableFunction(new Cosine(new Multiplication(new Constant(2), new VariableX())), "a"),
            new PlottableFunction(new Exponential(new Multiplication(new Sine(new VariableX()), new VariableX())), "b"));

    addFunctionsAndTheirDerivative(functions);
  }

  void toggleFunction(PlottableFunction function) {
    if (function.isPlotted()){
      unplot(function);
    }
    else{
      plot(function);
    }
  }

  private void unplot(PlottableFunction function) {
    functionChart.removeSeries(function.toString());
    function.setPlotted(false);
  }

  List<PlottableFunction> getFunctions(){
    return functions;
  }

  private void plot(PlottableFunction function){
    XYChart.Series<Number, Number> series = function.getData(lowerBound, upperBound);
    series.setName(function.toString());
    functionChart.getData().add(series);
    function.setPlotted(true);
  }

  private void addFunctionsAndTheirDerivative(Collection<PlottableFunction> functions){
    for(PlottableFunction function: functions){
      addFunctionAndItsDerivative(function);
    }
  }

  private void addFunctionAndItsDerivative(PlottableFunction function){
    add(function);
    add(function.derivative());
  }

  private void add(PlottableFunction function) {
    functions.add(function);
  }

  void clear() {
    functionChart.getData().clear();
    for(PlottableFunction function: functions){
      function.setPlotted(false);
    }
  }
}
