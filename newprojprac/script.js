console.log('Hello World');

function captalize(sentance){
        let s='';
        let flag=true;
    for(let i=0;i<sentance.length;i++){
        let ch=""+sentance.charAt(i);
        if(flag&&ch!==" "){
            let c=ch.toUpperCase();
            flag=false;
                   s+=c;
        }
        else if(!flag&&ch!==" "){
            let c=ch.toLowerCase();
            s+=c;
        }
        else{
            if(flag){
                flag=false;
            }
            else{
                flag=true;
            }
            s+=ch;
        }

    }
    return s;
}
console.log(captalize('hello world'));