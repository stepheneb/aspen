package com.github.kevwil.aspen;

import org.jboss.netty.channel.ChannelPipelineCoverage;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;

/**
 * thread-safe Netty callback handler
 *
 * By using this base class, you assert that member variables
 * are designed to be OK to share among multiple channels (or
 * there's nothing to share).
 *
 * You need to override the UpstreamHandler method you want to handle.
 *
 * @author kevwil
 * @since Dec. 21, 2009
 */
@ChannelPipelineCoverage("all")
public class SingleInstanceHandler
extends AspenUpstreamHandlerBase
{
}
