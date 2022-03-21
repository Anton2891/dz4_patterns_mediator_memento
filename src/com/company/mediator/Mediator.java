package com.company.mediator;

import com.company.mediator.components.Component;
import com.company.mediator.components.SecondThread;
import com.company.mediator.components.ThirdThread;

public interface Mediator extends Runnable{
    void stopRunFirst ();
    void stopRunOther();
}
