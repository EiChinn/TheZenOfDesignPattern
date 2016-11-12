package com.eichinn.visitor_pattern;

/**
 * Created by ei_chinn on 2016/11/12.
 */
public interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

}
