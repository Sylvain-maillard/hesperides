package org.hesperides.domain.modules.queries;

import lombok.Value;
import org.hesperides.domain.modules.Module;

/**
 * recherche un module par sa clé.
 */
@Value
public class ModuleByIdQuery {
    Module.Key key;
}