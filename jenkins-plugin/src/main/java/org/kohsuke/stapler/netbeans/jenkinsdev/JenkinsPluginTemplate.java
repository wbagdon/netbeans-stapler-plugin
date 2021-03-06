/*
 * The MIT License
 *
 * Copyright 2012 CloudBees.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.kohsuke.stapler.netbeans.jenkinsdev;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.modules.maven.api.archetype.ArchetypeWizards;
import org.openide.WizardDescriptor;
import org.openide.util.NbBundle.Messages;

public class JenkinsPluginTemplate {
    
    @Messages("archetype=Jenkins Plugin")
    @TemplateRegistration(folder=ArchetypeWizards.TEMPLATE_FOLDER, position=2012, iconBase="org/kohsuke/stapler/netbeans/jenkinsdev/jenkins.png", displayName="#archetype", description="archetype.html")
    public static WizardDescriptor.InstantiatingIterator<?> archetype() {
        return ArchetypeWizards.definedArchetype("org.jenkins-ci.tools", "maven-hpi-plugin", "LATEST", "http://repo.jenkins-ci.org/public/", Bundle.archetype());
    }

    private JenkinsPluginTemplate() {}

}
