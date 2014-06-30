package me.wener.commons.patterns.behavioral.State;

class StateLowerCase implements Statelike
{

    @Override
    public void writeName(final StateContext context, final String name)
    {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUpperCase());
    }

}
