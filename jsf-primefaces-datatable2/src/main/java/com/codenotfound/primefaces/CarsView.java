package com.codenotfound.primefaces;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class CarsView implements Serializable {

  private static final long serialVersionUID = 1L;

  @Inject
  private CarRepository carRepository;

  private List<Car> cars;

  @PostConstruct
  public void init() {
    cars = carRepository.findAll();
  }

  public List<Car> getCars() {
    return cars;
  }
  /**
   * <h:form>
            <h:panelGrid columns="2" >
                <h:outputLabel value="id" />
                <h:inputText value="#{carsview.car.id}" required="true" />
                <h:outputLabel value="year" />
                <h:inputText value="#{carsview.car.year}" />
                <h:outputLabel value="brand" />
                <h:inputText value="#{carsview.car.brand}" />
                <h:outputLabel value="color" />
                <h:inputText value="#{carsview.car.color}" />
                
            </h:panelGrid>

            <h:commandButton value="Agregar" actionListener="#{carsview.car( )}" />
</h:form>

   */


}
