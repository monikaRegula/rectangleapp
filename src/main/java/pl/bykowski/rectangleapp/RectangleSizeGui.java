package pl.bykowski.rectangleapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class RectangleSizeGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;
    private TextField textFieldSize;
    private TextArea textFieldRectangles;
    private Button buttonBigger;
    private Button buttonSmaller;


    @Autowired
    public RectangleSizeGui(RectangleRepo rectangleRepo) {
        this.rectangleRepo = rectangleRepo;
        this.textFieldSize = new TextField("Podaj rozmiar");
        this.buttonBigger = new Button("Pokaż większe");
        this.buttonSmaller = new Button("Pokaż mniejsze");
        textFieldRectangles = new TextArea("Rezultat:");

        buttonSmaller.addClickListener(clickEvent -> textFieldRectangles.setValue(rectangleRepo.getSmallRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
        buttonBigger.addClickListener(buttonClickEvent -> textFieldRectangles.setValue(rectangleRepo.getBigRectangles(Integer.parseInt(textFieldSize.getValue())).toString()));
//
        add(textFieldSize);
        add(buttonBigger);
        add(buttonSmaller);
        add(textFieldRectangles);
    }

}
