package com.homework;

import java.sql.SQLOutput;

/*
    Ex 05_06
    Author: Karol Kuchnio   
 */
enum ChemicalTypes {
    Alkali,
    Transition,
    Metals,
    None
}

public class ChemicalElement {

    public void classifyElement(Element[] elements){
        for (Element element: elements) {
            System.out.println(WhichTypeOfChemicalIsIt(element));
        }
    }

    private String WhichTypeOfChemicalIsIt(Element element) {
        switch (classyfyElement(element.getAtomicNumber())) {

            case Alkali:
                return element.toString() + " It is an alkali metal";
            case Transition:
                return element.toString() + " It is a transition metal.";
            case Metals:
                return element.toString() + " This is an metal.";
            case None:
               return element.toString();
            default:
                return "";

        }
    }

    private ChemicalTypes classyfyElement(int atomicNumber) {
        if (atomicNumber == 3 ||
                atomicNumber == 11 ||
                atomicNumber == 19 ||
                atomicNumber == 37 ||
                atomicNumber == 55 ||
                atomicNumber == 87) {
            return ChemicalTypes.Alkali;
        } else if (atomicNumber >= 21 && atomicNumber <= 31 ||
                atomicNumber >= 39 && atomicNumber <= 48 ||
                atomicNumber >= 72 && atomicNumber <= 80 ||
                atomicNumber >= 104 && atomicNumber <= 112) {
            return ChemicalTypes.Transition;
        } else if (atomicNumber == 13 || atomicNumber == 49 ||
                atomicNumber == 50 || (atomicNumber >= 81 &&
                atomicNumber <= 83) || (atomicNumber >= 113 && atomicNumber <= 116)) {
            return ChemicalTypes.Metals;
        } else {
            return ChemicalTypes.None;
        }
    }
}
