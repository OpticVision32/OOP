import Controller.CalcController;
import Model.ComplexCalcModel;
import Model.ComplexNumber;
import Model.TxtLogger;
import Model.iCalcModel;
import Model.iLogger;
import View.DefaultCalcView;
import View.iCalcView;

public class App {
    public static void main(String[] args) throws Exception {
        iCalcModel<ComplexNumber> model = new ComplexCalcModel();
        iCalcView<ComplexNumber> view = new DefaultCalcView();
        iLogger<ComplexNumber> logger = new TxtLogger("Less4x");
        CalcController<ComplexNumber> controller = new CalcController<ComplexNumber>(model, view, logger);
    }
}
