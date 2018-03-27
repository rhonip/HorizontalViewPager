# HorizontalViewPager3
HorizontalViewpager with dynamic background

 @Override
           public void onPageSelected(int position) {
               if(horizontalInfiniteCycleViewPager.getRealItem()==0)
               {
                   text.setText("hello1");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main);

                  //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               if(horizontalInfiniteCycleViewPager.getRealItem()==1)
               {
                   text.setText("hello2");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main1);
                   //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               if(horizontalInfiniteCycleViewPager.getRealItem()==2)
               {
                   text.setText("hello3");
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main2);
                   //Toast.makeText(getContext(), "displayed", Toast.LENGTH_SHORT).show();
               }
               /*else
                   horizontalInfiniteCycleViewPager.setBackgroundResource(R.drawable.bg_main1);*/
           }
           
           
Reference: infiniteCycleViewPager
