package org.engcia.cf.listeners;

import org.engcia.cf.model.Evidence;
import org.engcia.cf.model.Hypothesis;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;
//import org.kie.api.runtime.rule.FactHandle;

public class FactListener implements RuleRuntimeEventListener{

	@Override
	public void objectDeleted(ObjectDeletedEvent event) {
		// FactHandle fact = event.getFactHandle();
		System.out.println(
						"Retracted: " +
						//fact.toString() +
						event.getOldObject().toString()
						);
	}

	@Override
	public void objectInserted(ObjectInsertedEvent event) {
		// FactHandle fact = event.getFactHandle();
		System.out.println(
						"Asserted: " +
						//fact.toString() + 
						event.getObject().toString()
						);
	}

	@Override
	
public void objectUpdated(ObjectUpdatedEvent event) {
    Object obj = event.getObject();
    if (obj instanceof Evidence) {
        Evidence evidence = (Evidence) obj;
        double newCF = evidence.getCf(); // get the new CF value
        System.out.println("Updated CF value for Evidence: " + newCF);
        
        // update the CF value for the Hypothesis object
        Hypothesis hypothesis = (Hypothesis) TrackingAgendaListener.getFactRef(Hypothesis.class, "varroa", "true");
        hypothesis.updateConfidence(newCF);
		System.out.println("Updated CF value for Hypothesis: "+hypothesis.getCf());
		
    }
}

}
