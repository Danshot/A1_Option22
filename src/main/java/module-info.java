module com.calc.inst_work_calc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.calc.inst_work_calc to javafx.fxml;
    exports com.calc.inst_work_calc;
}