package org.light4j.sping4.usually.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")//①
public class DemoPrototypeService {

}
