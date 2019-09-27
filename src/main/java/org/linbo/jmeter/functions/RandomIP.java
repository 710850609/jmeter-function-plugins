package org.linbo.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;
import org.linbo.jmeter.functions.core.RandomString;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 随机IPv4
 * @author LinBo
 * @date 2019-09-26 16:46
 */
public class RandomIP extends AbstractFunction {

    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        return RandomString.getIp();
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {
        checkParameterCount(collection, 0, 0);
    }

    @Override
    public String getReferenceKey() {
        return "__RandomIP";
    }

    public List<String> getArgumentDesc() {
        return new LinkedList();
    }
}
