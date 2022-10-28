/**
 *
 */
package org.training.core.job;

import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.training.core.model.EmptyCartRemovalCronJobModel;



/**
 * @author akum1320
 *
 */
public class CartRemovalJob extends AbstractJobPerformable<EmptyCartRemovalCronJobModel>
{

	@Override
	public PerformResult perform(final EmptyCartRemovalCronJobModel arg0)
	{
		// XXX Auto-generated method stub
		return null;
	}



}
