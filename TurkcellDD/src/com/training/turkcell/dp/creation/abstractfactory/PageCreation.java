package com.training.turkcell.dp.creation.abstractfactory;


public class PageCreation {

    public void createPage(final int themeType) {
        IButtonRender buttonRenderLoc = ButtonFactory.createButtonRender(themeType);
        ILabelRender labelRenderLoc = LabelFactory.createLabelRender(themeType);
        buttonRenderLoc.render();
        labelRenderLoc.render();

        IRender renderLoc = RenderFactory.createRender(themeType);
        renderLoc.buttonRender()
                 .render();
        renderLoc.labelRender()
                 .render();
    }

}
