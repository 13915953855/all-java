package com.njxs.netty.hello;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class HelloWorldClient2Handler extends ChannelInboundHandlerAdapter{
    
    
      @Override
      public void channelActive(ChannelHandlerContext ctx) {
          System.out.println(System.currentTimeMillis()+"HelloWorldClient2Handler channelActive");
          ctx.fireChannelActive();
          //如果一个channelPipeline中有多个channelHandler时，且这些channelHandler中有同样的方法时，例如这里的channelActive方法，
          // 只会调用处在第一个的channelHandler中的channelActive方法，如果你想要调用后续的channelHandler的同名的方法就需要调用以“fire”为开头的方法了，这样做很灵活
      }
  
      @Override
      public void channelRead(ChannelHandlerContext ctx, Object msg) {
         System.out.println(System.currentTimeMillis()+"HelloWorldClient2Handler channelRead Message:"+msg);
      }
      
      @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
          System.out.println(System.currentTimeMillis()+"HelloWorldClient2Handler channelInactive===========");
        super.channelInactive(ctx);
    }
  
  
     @Override
     public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
         cause.printStackTrace();
         ctx.close();
      }

}
