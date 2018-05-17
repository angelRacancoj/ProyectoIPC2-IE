/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.objectsManager;

import imageneditor.backEnd.Objects.canvasStruct;
import imageneditor.backEnd.Objects.color;
import imageneditor.backEnd.Objects.lienzoObj;
import imageneditor.backEnd.Objects.sizeL;
import imageneditor.exceptions.InputsVaciosException;

/**
 *
 * @author angel
 */
public class canvasManager {

    canvasStruct newCanvas;

    public canvasManager(String path) {
        newCanvas = new canvasStruct(path);
    }

    /**
     * This method create a lienzo using the RGB codification for the "fondo"
     * (background) of the draw
     *
     * @param id
     * @param name
     * @param tipo
     * @param red
     * @param green
     * @param blue
     * @param cuadro
     * @param dimension
     * @throws InputsVaciosException
     */
    public void addLienzo(String id, String name, String tipo, int red, int green, int blue, int cuadro, int dimension) throws InputsVaciosException {
        if (!newCanvas.existLienzo(id)) {
            color newColor = new color(red, green, blue);
            sizeL newSize = new sizeL(cuadro, dimension);
            lienzoObj newLienzo = new lienzoObj(id, name, tipo, newColor, newSize);
            newCanvas.addlienzoObj(newLienzo);
        } else {
            throw new InputsVaciosException("Lienzo already exist");
        }
    }

    /**
     * This method create a lienzo using the Hexadecimal codification for the
     * "fondo" (background) of the draw
     *
     * @param id
     * @param name
     * @param tipo
     * @param hexa
     * @param cuadro
     * @param dimension
     * @throws InputsVaciosException
     */
    public void addLienzo(String id, String name, String tipo, String hexa, int cuadro, int dimension) throws InputsVaciosException {
        if (!newCanvas.existLienzo(id)) {
            color newColor = new color(hexa);
            sizeL newSize = new sizeL(cuadro, dimension);
            lienzoObj newLienzo = new lienzoObj(id, name, tipo, newColor, newSize);
            newCanvas.addlienzoObj(newLienzo);
        } else {
            throw new InputsVaciosException("Lienzo already exist");
        }
    }
}
