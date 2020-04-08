	.file	"Gcd.c"
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	andl	$-16, %esp
	subl	$32, %esp
	call	getint
	movl	%eax, 24(%esp)
	call	getint
	movl	%eax, 28(%esp)
	jmp	.L2
.L4:
	movl	24(%esp), %eax
	cmpl	28(%esp), %eax
	jle	.L3
	movl	28(%esp), %eax
	subl	%eax, 24(%esp)
	jmp	.L2
.L3:
	movl	24(%esp), %eax
	subl	%eax, 28(%esp)
.L2:
	movl	24(%esp), %eax
	cmpl	28(%esp), %eax
	jne	.L4
	movl	24(%esp), %eax
	movl	%eax, (%esp)
	call	putint
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.ident	"GCC: (Ubuntu/Linaro 4.6.3-1ubuntu5) 4.6.3"
	.section	.note.GNU-stack,"",@progbits
