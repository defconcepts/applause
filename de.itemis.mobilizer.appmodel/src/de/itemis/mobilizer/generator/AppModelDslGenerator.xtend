/*
 * generated by Xtext
 */
package de.itemis.mobilizer.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import de.itemis.mobilizer.appModelDsl.Application
import java.io.File

class AppModelDslGenerator implements IGenerator {
	
	@Inject
	de.itemis.mobilizer.generator.iphone.Generator as iPhone
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(element: resource.allContentsIterable) {
			if(element instanceof Application) {
				// TODO: test if generator should be applied (e.g. generator.isActive?)
				iPhone.generate(element as Application, fsa)
			}
		}
	}
}
