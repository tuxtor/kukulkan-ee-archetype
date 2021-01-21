#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS Base activator
 *
 * @author tuxtor
 */
@ApplicationPath("/rest")
@ApplicationScoped
public class KukulkanRestApplication extends Application {
}
