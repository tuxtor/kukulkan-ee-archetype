#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.enterprise.inject.Default;

public class HelloService {

    public String doHello(String name){
        return "Hello ".concat(name);
    }
}
