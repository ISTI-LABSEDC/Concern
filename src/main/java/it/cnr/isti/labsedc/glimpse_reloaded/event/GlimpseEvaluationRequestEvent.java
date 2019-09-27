package it.cnr.isti.labsedc.glimpse_reloaded.event;

import it.cnr.isti.labsedc.glimpse_reloaded.cep.CepType;
import it.cnr.isti.labsedc.glimpse_reloaded.listener.ServiceChannelProperties;

public class GlimpseEvaluationRequestEvent<T> extends GlimpseBasicEvent<T> {

	private static final long serialVersionUID = 6545740721731539243L;
	private String evaluationRule;
	private ServiceChannelProperties propertyRequested;

	public GlimpseEvaluationRequestEvent(
			T data,
			CepType type,
			String evaluationRule,
			ServiceChannelProperties propertyRequested,
			String senderID,
			String checksum,
			long timestamp) {
		super(data, type, senderID, checksum, timestamp);
		this.setEvaluationRule(evaluationRule);
		this.setPropertyRequested(propertyRequested);
	}

	public ServiceChannelProperties getPropertyRequested() {
		return propertyRequested;
	}

	public void setPropertyRequested(ServiceChannelProperties propertyRequested) {
		this.propertyRequested = propertyRequested;
	}

	public String getEvaluationRule() {
		return evaluationRule;
	}

	public void setEvaluationRule(String evaluationRule) {
		this.evaluationRule = evaluationRule;
	}
}
